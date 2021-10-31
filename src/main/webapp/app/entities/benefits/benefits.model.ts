import { IEmployee } from 'app/entities/employee/employee.model';

export interface IBenefits {
  id?: number;
  name?: string;
  employee?: IEmployee;
}

export class Benefits implements IBenefits {
  constructor(public id?: number, public name?: string, public employee?: IEmployee) {}
}

export function getBenefitsIdentifier(benefits: IBenefits): number | undefined {
  return benefits.id;
}
