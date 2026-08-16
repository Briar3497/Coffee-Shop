import { Routes } from '@angular/router';
import { Menu } from './components/menu/menu';
import { Events } from './components/events/events';
import { AboutUs } from './components/about-us/about-us';
import { Home } from './components/home/home';

export const routes: Routes = [
    {path: "home", component: Home},
    {path: "menu", component: Menu},
    {path: "events", component: Events},
    {path: "about-us", component: AboutUs}
];
