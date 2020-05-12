import { Component, OnInit } from '@angular/core';
import { WishlistServiceService, Products, ProductsUser } from '../wishlist-service.service';

@Component({
  selector: 'app-filterproductcomponent',
  templateUrl: './filterproductcomponent.component.html',
  styleUrls: ['./filterproductcomponent.component.css']
})
export class FilterproductcomponentComponent implements OnInit {

  minprice: number;
  maxprice:number;
  message:string;
  mstatus:boolean;
  products:Products[];
  status:boolean;
  constructor(private service:WishlistServiceService) {
    this.status=false;
   }

  ngOnInit(): void {
  }
  submit(minprice:number,maxprice:number){
  this.service.getProductsData(minprice,maxprice).subscribe(
    response => this.handleSuccessfulResponse(response),
  );
  }
  handleSuccessfulResponse(response) {
    console.log(response);
    this.status=true;
    this.products = response;
  }
  minPrice(minprice:number)
  {
    this.minprice=minprice;
  }
  maxPrice(maxprice:number)
  {
    if(this.minprice>maxprice)
    {this.message="Max price should be greater than Min price";
    this.mstatus=true;
  }
  }
}