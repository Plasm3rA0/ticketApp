import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { department } from './interfaces';
import { DepartmentComponent } from './department/department.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, DepartmentComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'TicketFront';
  department: department[] = [{
    name: "IT",
    size: 2,
    isEnabled: true
  },
  {
    name: "Marketing",
    size: 1,
    isEnabled: true
  }
  ]
}
