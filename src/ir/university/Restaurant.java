package ir.university;

public class Restaurant {
    protected DinnerMenu[] dinnerMenus = new DinnerMenu[50];
    protected LunchMenu[] lunchMenus = new LunchMenu[50];
    protected Customer[] customers = new Customer[100];
    protected Employee[] employees = new Employee[50];

    public Restaurant() {
    }

    public void addDinner(DinnerMenu dinnerMenu) {
        int i;
        if (dinnerMenu.getType().equals(Type.DRINK)) {
            for(i = 0; i < this.dinnerMenus.length; ++i) {
                if (this.dinnerMenus[i] == null) {
                    this.dinnerMenus[i] = dinnerMenu;
                    break;
                }
            }
        } else if (dinnerMenu.getType().equals(Type.FOOD)) {
            for(i = 0; i < this.dinnerMenus.length; ++i) {
                if (this.dinnerMenus[i] == null) {
                    this.dinnerMenus[i] = dinnerMenu;
                    break;
                }
            }
        }

    }

    public void showFoodDinner() {
        System.out.println("Dinner Menu:");
        DinnerMenu[] var1 = this.dinnerMenus;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            DinnerMenu dinnerMenu = var1[var3];
            if (dinnerMenu != null && dinnerMenu.getType() == Type.FOOD) {
                System.out.println(dinnerMenu.toString());
            }
        }

    }

    public void showDrinkDinner() {
        System.out.println("Dinner Menu:");
        DinnerMenu[] var1 = this.dinnerMenus;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            DinnerMenu dinnerMenu = var1[var3];
            if (dinnerMenu != null && dinnerMenu.getType().equals(Type.DRINK)) {
                System.out.println(dinnerMenu.toString());
            }
        }

    }

    public void addLunch(LunchMenu lunchMenu) {
        int i;
        if (lunchMenu.getType().equals(Type.DRINK)) {
            for(i = 0; i < this.dinnerMenus.length; ++i) {
                if (this.lunchMenus[i] == null) {
                    this.lunchMenus[i] = lunchMenu;
                    break;
                }
            }
        } else if (lunchMenu.getType().equals(Type.FOOD)) {
            for(i = 0; i < this.dinnerMenus.length; ++i) {
                if (this.lunchMenus[i] == null) {
                    this.lunchMenus[i] = lunchMenu;
                    break;
                }
            }
        }

    }

    public void showFoodLunch() {
        System.out.println("Lunch Menu:");

        for(int i = 0; i < this.lunchMenus.length; ++i) {
            if (this.lunchMenus[i] != null && this.lunchMenus[i].getType().equals(Type.FOOD)) {
                System.out.println(this.lunchMenus[i].toString());
            }
        }

    }

    public void showDrinkLunch() {
        System.out.println("Lunch Menu:");
        LunchMenu[] var1 = this.lunchMenus;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LunchMenu lunchMenu = var1[var3];
            if (lunchMenu != null && lunchMenu.getType().equals(Type.DRINK)) {
                System.out.println(lunchMenu.toString());
            }
        }

    }

    public void addCustomer(Customer customer) {
        for(int i = 0; i < this.customers.length; ++i) {
            if (this.customers[i] == null) {
                this.customers[i] = customer;
                break;
            }
        }

    }

    public void showCustomerInfo() {
        Customer[] var1 = this.customers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Customer customer = var1[var3];
            if (customer != null) {
                System.out.println(customer.toString());
            }
        }

    }

    public void addEmployee(Employee employee) {
        for(int i = 0; i < this.employees.length; ++i) {
            if (this.employees[i] == null) {
                this.employees[i] = employee;
                break;
            }
        }

    }

    public void showEmployeeInfo() {
        Employee[] var1 = this.employees;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Employee employee = var1[var3];
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }

    }

    public void reserveDinner(Customer customer, String dinner) {
        boolean order = false;
        DinnerMenu[] var4 = this.dinnerMenus;
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            DinnerMenu dinnerMenu = var4[var6];
            if (dinnerMenu != null && dinnerMenu.code.equals(dinner)) {
                if (dinnerMenu.holding > 0) {
                    customer.reserveDinner(dinnerMenu);
                    order = true;
                } else {
                    order = false;
                    System.out.println(dinnerMenu.name + " hasn't holding");
                }
            }
        }

    }

    public void remove(Customer customer, String code) {
        DinnerMenu var10001;
        int i;
        for(i = 0; i < customer.getNumOfReserveDinner(); ++i) {
            if (this.dinnerMenus[i].code.equals(code)) {
                customer.removeDinner(this.dinnerMenus[i]);
                var10001 = this.dinnerMenus[i];
                System.out.println(var10001.name + " canceled");
                break;
            }
        }

        for(i = 0; i < customer.getNumOfReserveLunch(); ++i) {
            if (this.lunchMenus[i].code.equals(code)) {
                customer.removeLunch(this.lunchMenus[i]);
                var10001 = this.dinnerMenus[i];
                System.out.println(var10001.name + " canceled");
                break;
            }
        }

    }

    public void reserveLunch(Customer customer, String lunch) {
        LunchMenu[] var3 = this.lunchMenus;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            LunchMenu lunchMenu = var3[var5];
            if (lunchMenu != null && lunchMenu.code.equals(lunch)) {
                if (lunchMenu.holding > 0) {
                    customer.reserveLunch(lunchMenu);
                    System.out.println(lunchMenu.name + " & ");
                } else {
                    System.out.println(lunchMenu.name + " hasn't holding");
                }
            }
        }

    }
}
