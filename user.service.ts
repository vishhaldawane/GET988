import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private myHttp: HttpClient) { }

  fetchAllUserData() : Observable <any[]> {
    alert('fetching all user data from http typecode website');
    return this.myHttp.get<any[]>("https://jsonplaceholder.typicode.com/todos");
  }
}
