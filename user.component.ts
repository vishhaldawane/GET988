import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private us: UserService) { }

  allUserData: any[]=[];
  fetchIt() {
    this.us.fetchAllUserData().subscribe(
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
