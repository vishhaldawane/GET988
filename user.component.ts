import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { ToDo } from './ToDo';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private us: UserService) { }

  allToDoData: ToDo[]=[];
  allUserData: any[]=[];

  fetchToDo() {
    this.us.fetchAllToDoData().subscribe(
      (data: ToDo[])=> //srping data is pushed into this data variable
      {
        this.allToDoData = data; //assign data to allFriends so that html can fetch it in tr td tags
        console.log(this.allToDoData);
      }, 
      (err) => {
        console.log(err);
      }
    ); 
  }

  fetchUsers() {
    this.us.fetchAllUsersData().subscribe(
      (data: any[])=> //srping data is pushed into this data variable
      {
        this.allUserData = data; //assign data to allFriends so that html can fetch it in tr td tags
        console.log(this.allUserData);
      }, 
      (err) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
  }
}
