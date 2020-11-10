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
  selector: 'app-survey',
  templateUrl: './survey.component.html',
  styleUrls: ['./survey.component.scss']
})
export class SurveyComponent implements OnInit {
  student: StudentModel = {
    city: '',
    email: '',
    fName: '',
    lName: '',
    phone: '',
    state: '',
    street: '',
    fDate: '',
    studentID: undefined,
    zipcode: undefined
  };

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  submit(): void {
    console.log('----------------submit----------------');
    console.log(this.student);
    const options = {
      method: 'POST',
      body: JSON.stringify(this.student),
      headers: {
        'Content-Type': 'application/json; charset=UTF-8'
      }
    };
    fetch('/FormServlet', options)
      .then(res => res.json())
      .then(res => {
        console.log(res);
        // this.router.navigate(['/acknowledgment', {state: this.student}]).then(r => console.log('navigation successful'));
        this.router.navigate(['/acknowledgment'],
          {state: this.student}).then(r => console.log('navigation successful'));
      })
      .catch(err => {
        console.log(err);
        this.router.navigate(['/acknowledgment']);
      });
  }

}
