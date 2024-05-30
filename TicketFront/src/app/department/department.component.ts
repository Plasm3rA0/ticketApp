import { Component, Input } from '@angular/core';
import { department } from '../interfaces';

@Component({
  selector: 'app-department',
  standalone: true,
  imports: [],
  templateUrl: './department.component.html',
  styleUrl: './department.component.scss'
})
export class DepartmentComponent {
  @Input()
  department!: department[];
}
