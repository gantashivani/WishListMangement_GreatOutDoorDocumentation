import { Component, OnInit } from '@angular/core';
import { WishlistServiceService, Products, ProductsUser } from '../wishlist-service.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-listproduct',
  templateUrl: './listproduct.component.html',
  styleUrls: ['./listproduct.component.css']
})
export class ListproductComponent implements OnInit{
  
  product:Products[];
  data:ProductsUser =new ProductsUser(0,'','',[]);

  userId:any;
  password:any;
  userName:any;

  constructor(private service:WishlistServiceService,private routing:ActivatedRoute,private router: Router){

    let user=this.routing.snapshot.paramMap.get('userId');
    this.userId=Number(user); /** snapshot returns string */
    this.password=this.routing.snapshot.paramMap.get('password');
    this.userName=this.routing.snapshot.paramMap.get('userName');
    
  }
  
 ngOnInit(): void 
 {
   this.service.getproducts().subscribe( 
     response =>{this.handleSuccessfulResponse(response),console.log(response)}
     );
 }
  onAdd(product:Products){
    //retriving userdata from login page 
    let user=this.routing.snapshot.paramMap.get('userId');
    this.data.userId=Number(user); /** snapshot returns string */
    this.data.password=this.routing.snapshot.paramMap.get('password');
    this.data.userName=this.routing.snapshot.paramMap.get('userName');
    
    let productid=Math.random()
    this.data.product=[
                {productId : productid,
                 productCatogery:product[1],
                 productName:product[0],
				 prize : product[2]		,
				 colour :product[6],
				 dimensions :product[3],
				 specifications :product[4], 
				 manufacture :product[5] ,
				 quantity :product[7],
				 retailerId : product[8],
                        }];

    this.service.onAddToWishList(this.data).subscribe(
      (result)=>{
        if(result!=null)
          alert("Added sucessfully");
        else 
          alert("Add failed");
                }); 	
	}
      onView()
      {
        this.router.navigate(['/app-viewwishlist',this.userId,this.password,this.userName]);
      }

		onSearch()
		{
			this.router.navigate(['/SearchProduct']);
		}
		
		onFilter()
		{
			this.router.navigate(['/FilterProduct']);
    }
    onLogOut()
    {
      this.router.navigate(['/'])
    }
      handleSuccessfulResponse(response)
      {
        this.product=response;
      }
}