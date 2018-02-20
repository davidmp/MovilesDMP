import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { UserRestProvider } from '../../providers/user-rest/user-rest';

@Component({
  selector: 'page-contact',
  templateUrl: 'contact.html'
})
export class ContactPage {
  users: string[];
  errorMessage: string;
  constructor(public navCtrl: NavController, public rest: UserRestProvider) {

  }

  ionViewDidLoad() {
    this.getUsers();
  }  

  getUsers() {
    this.rest.getUsers()
       .subscribe(
        users => this.users = users,
         error =>  this.errorMessage = <any>error);
  }  
}
