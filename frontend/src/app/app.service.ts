import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AppService {

  private _server = 'http://ec2-18-231-130-54.sa-east-1.compute.amazonaws.com:8080';

  constructor(private _http: HttpClient) { }
  
  getAllLocations(): Observable<any> {
      const headers = new HttpHeaders({ 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*'});
      return this._http.get(this._server + '/api/v1/location', { headers: headers});
  }
}
