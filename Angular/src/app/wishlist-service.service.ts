import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WishlistServiceService {
 
  constructor(private http:HttpClient) { }
  
  user: any;
  product:Products[];
  userdata:UserDTO;

  public getproducts(){
    console.log("testing");
    return this.http.get<Products[]>("http://localhost:1002/WishList/ViewProducts");
  }
   
  public onAddToWishList(data: ProductsUser) {
    console.log(data);
    return this.http.post<ProductsUser>("http://localhost:2021/AddToWishList/Add",data,{responseType:'json'});
  }
  
  public validateUser(userId) {
    console.log(userId)
    return this.http.get("http://localhost:2001/Login/ValidateUser/"+userId,{responseType:'text'});
  }

  public viewproduct(user:number) {
    console.log("inservice");
    return this.http.get<UserDTO>("http://localhost:1004/WishList/ViewWishList/"+user,{responseType:'json'});
  }
}

export class UserDTO
{
  userId:number;
  password:string;
  userName:string;
  constructor(userId:number,password:string,userName:string)
  {
    this.userId=userId;
    this.password=password;
    this.userName=userName; 
  }
}

export class Products
{
  productId:number;
  productCatogery:string;
  productName:string;

  constructor(productId:number,productCatogery:string,productName:string)
  {
    this.productId=productId;
    this.productCatogery=productCatogery;
    this.productName=productName;
  }
}

export class ProductsUser
{
  userId:number;
  password:string;
  userName:string;
  product:Products[];

  constructor(userId:number,password:string,userName:string,product:Products[])
  {
    this.userId=userId;
    this.password=password;
    this.userName=userName;
    this.product=product;
  }
}