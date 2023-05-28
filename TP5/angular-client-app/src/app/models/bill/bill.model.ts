import {ProductItem} from "../productItems/product-item.model";

export class Bill {

  id:number;
  billDate:string;
  price:any;
  customerEmail : string;
  customerName : string;
  productItems : ProductItem[];

  constructor( i:number,  billDat:string,  customerEmai : string,customerNam:string,producti:ProductItem[]){

    this.id=i;
    this.billDate=billDat;
    this.customerName=customerNam;
    this.customerEmail=customerEmai;
    this.productItems=producti;
  }
}
