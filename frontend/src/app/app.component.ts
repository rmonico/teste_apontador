import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ AppService ],
})

export class AppComponent {
  title = 'my-app';
  locations: string[];

  constructor(private _appService: AppService) {}

  ngOnInit(): void {
      this._appService.getAllLocations().subscribe(         (data) => {
            console.log(data);
            this.locations = data;
        },
        (err: HttpErrorResponse) => {
            if (err.error instanceof Error) {
                console.log('Client-side error occured.');
            } else {
                console.log('Server-side error occured.');
            }
        });
  }
}
