export class Product {

    constructor(public id: number,
                public name: string,
                public imageUrl: string,
                public imageAlt: string,
                public description: string,
                public price: number,
                public createdAt: Date,
                public updatedAt: Date
            ) {

    };
}
