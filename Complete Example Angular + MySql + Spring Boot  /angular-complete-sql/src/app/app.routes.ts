import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListaPersonaComponent } from './lista-persona/lista-persona.component';


export const AppRoutes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'lista', component: ListaPersonaComponent },
];