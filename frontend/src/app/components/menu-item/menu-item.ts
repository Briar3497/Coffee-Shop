import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../services/product';
import { Product } from '../../common/product';
import { CurrencyPipe } from '@angular/common';

@Component({
  selector: 'app-menu-item',
  imports: [CurrencyPipe],
  templateUrl: './menu-item.html',
  styleUrl: './menu-item.css',
})
export class MenuItem implements OnInit {

  products: Product[] = [];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.listProducts();
  }

  listProducts() {
  this.productService.getProducts().subscribe({
  next: (response) => {
    this.products = response.map((item: any) => {
      const id = Number(item._links.self.href.split('/').pop());

      return new Product(
        id,
        item.productName,
        item.productImage,
        item.productImageAlt,
        item.productDescription,
        item.productPrice,
        new Date(item.createdDate),
        new Date(item.updatedDate)
      );
    });

    console.log('Mapped products:', this.products);
    console.log('Product IDs:', this.products.map(p => p.id));
  },
  error: (error) => {
    console.error('Failed to load products:', error);
  }
});

  }
}