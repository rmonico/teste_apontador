import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AppService {

  private _server = 'http://localhost:8080';

  constructor(private _http: HttpClient) { }
  
  getAllLocations(): Observable<any> {
      const headers = new HttpHeaders();

      headers.set("content-type", "application/json");

      return this._http.get(this._server + '/api/v1/location', { headers: headers });
  }
}
