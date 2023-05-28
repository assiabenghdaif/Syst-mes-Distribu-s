export class ProductItem {

  public id:number;
  quatity : number;
  price : any;
  productName : string;

  constructor(id:number,  quality : number,
  price : any,
  productName : string) {

    this.id=id;
    this.price=price;
    this.quatity=quality;
    this.productName=productName;
  }

}
