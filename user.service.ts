import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ToDo } from './user/ToDo';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private myHttp: HttpClient) { }

  fetchAllToDoData() : Observable <ToDo[]> {
    //alert('fetching all user data from http typecode website');
    return this.myHttp.get<ToDo[]>("https://jsonplaceholder.typicode.com/todos");
  }

  fetchAllUsersData() {
    return this.myHttp.get<any[]>("https://jsonplaceholder.typicode.com/users");
    
  }
}
