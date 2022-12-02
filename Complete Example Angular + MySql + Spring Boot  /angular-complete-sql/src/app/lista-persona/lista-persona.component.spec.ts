import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaPersonaComponent } from './lista-persona.component';

describe('ListaPersonaComponent', () => {
  let component: ListaPersonaComponent;
  let fixture: ComponentFixture<ListaPersonaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaPersonaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaPersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
