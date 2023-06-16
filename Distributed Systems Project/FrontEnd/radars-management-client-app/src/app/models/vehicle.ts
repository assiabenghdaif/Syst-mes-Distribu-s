import {Owner} from "./owner";

export class Vehicle {
  id!:number;
  licensePlate!:string;
  brand!:string;
  fiscalPower!:number;
  model!:string;
  owner!:Owner;

  _links!: {
    self: {
      href: string;
    };
    vehicle: {
      href: string;
    };
    owner: {
      href: string;
    };
  };



}
