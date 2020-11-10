import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

type StudentModel = {
  studentID: number;
  fName: string;
  lName: string;
  email: string;
  street: string;
  zipcode: number;
  city: string;
  state: string;
  phone: string;
  fDate: string;
};

@Component({
  selector: 'app-acknowledgment',
  templateUrl: './acknowledgment.component.html',
  styleUrls: ['./acknowledgment.component.scss']
})
export class AcknowledgmentComponent implements OnInit {
  student: StudentModel;

  constructor(private router: Router) {
    try {
      this.student = this.router.getCurrentNavigation().extras.state as StudentModel;
      console.log('ack:', this.student.fName);
    } catch (err) {
    }
  }

  ngOnInit(): void {
  }

}
