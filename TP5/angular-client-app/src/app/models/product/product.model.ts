export class Product {
  id:number;
  name:string;
  price:any;
  quantity : any;

  constructor(public i:number, public nam:string, public pric:any,public quantit : any,){

    this.id=i;
    this.name=nam;
    this.pric=pric;
    this.quantity=quantit;
  }
}
