import {Component, OnInit} from '@angular/core';
import {Router, ActivatedRoute, ParamMap, Params} from '@angular/router';

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
  visitedAt: string;
  fDate: string;
};

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {
  student: StudentModel;
  sid: string;

  constructor(private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.route.params
      .subscribe(param => this.sid = param.id);
    console.log(this.sid);
    fetch(`FormServlet?studentID=${this.sid}`)
      .then(res => res.json())
      .then(data => this.student = data)
      .catch(err => err);
  }

}
