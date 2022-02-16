package ir.university;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        mainMenu(restaurant);
    }

    public static void mainMenu(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Welcome to restaurant system***\n1) Login as manager\n2) Login as employee\n3) Login as customer\n4) Exit ");
        int choose = scanner.nextInt();
        switch(choose) {
            case 1:
                manager(restaurant);
                break;
            case 2:
                addEmployee(restaurant);
                break;
            case 3:
                addCustomer(restaurant);
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("please enter correct number : ");
                mainMenu(restaurant);
        }

    }

    public static void manager(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        DinnerMenu dinnerMenu;
        LunchMenu lunchMenu;
        System.out.println("***Manager Menu***\n1) Add to dinner menu\n2) Add to lunch menu\n3) Customer info\n4) Employees info\n5) Back to main menu");
        int choose = scanner.nextInt();
        int choice;
        String code;
        String name;
        long price;
        int holding;
        switch(choose) {
            case 1:
                System.out.println("1) Food\n2) Drink");
                choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("\t*** Food ***");
                        System.out.println("Name : ");
                        name = scanner.next();
                        System.out.println("Code : ");
                        code = scanner.next();
                        System.out.println("Price : ");
                        price = scanner.nextLong();
                        System.out.println("Holding : ");
                        holding = scanner.nextInt();
                        dinnerMenu = new DinnerMenu(code, name, price, holding, Type.FOOD);
                        restaurant.addDinner(dinnerMenu);
                        break;
                    case 2:
                        System.out.println("\t*** Drink ***");
                        System.out.println("Name : ");
                        name = scanner.next();
                        System.out.println("Code : ");
                        code = scanner.next();
                        System.out.println("Price : ");
                        price = scanner.nextLong();
                        System.out.println("Holding : ");
                        holding = scanner.nextInt();
                        dinnerMenu = new DinnerMenu(code, name, price, holding, Type.DRINK);
                        restaurant.addDinner(dinnerMenu);
                }

                manager(restaurant);
                break;
            case 2:
                System.out.println("1) Food\n2) Drink");
                choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("\t*** Food ***");
                        System.out.println("Name : ");
                        name = scanner.next();
                        System.out.println("Code : ");
                        code = scanner.next();
                        System.out.println("Price : ");
                        price = scanner.nextLong();
                        System.out.println("Holding : ");
                        holding = scanner.nextInt();
                        lunchMenu = new LunchMenu(code, name, price, holding, Type.FOOD);
                        restaurant.addLunch(lunchMenu);
                        break;
                    case 2:
                        System.out.println("\t*** Drink ***");
                        System.out.println("Name : ");
                        name = scanner.next();
                        System.out.println("Code : ");
                        code = scanner.next();
                        System.out.println("Price : ");
                        price = scanner.nextLong();
                        System.out.println("Holding : ");
                        holding = scanner.nextInt();
                        lunchMenu = new LunchMenu(code, name, price, holding, Type.DRINK);
                        restaurant.addLunch(lunchMenu);
                }

                manager(restaurant);
                break;
            case 3:
                restaurant.showCustomerInfo();
                manager(restaurant);
                break;
            case 4:
                restaurant.showEmployeeInfo();
                manager(restaurant);
                break;
            case 5:
                mainMenu(restaurant);
                break;
            default:
                System.out.println("please enter correct number : ");
                manager(restaurant);
        }

    }

    public static void addEmployee(Restaurant restaurant) {
        Employee employee;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : ");
        String name = scanner.next();
        System.out.println("Family : ");
        String family = scanner.next();
        System.out.println("NationalCode : ");
        String nationalCode = scanner.next();
        employee = null;
        System.out.println("1) Male \n2) Female");
        int choice = scanner.nextInt();
        int choose;
        label21:
        switch(choice) {
            case 1:
                System.out.println("1) Chef\n2) Waiter\n3) Worker\n4) Driver ");
                choose = scanner.nextInt();
                switch(choose) {
                    case 1:
                        employee = new Employee(name, family, Gender.MALE, nationalCode, JobPosition.CHEF);
                        restaurant.addEmployee(employee);
                        break label21;
                    case 2:
                        employee = new Employee(name, family, Gender.MALE, nationalCode, JobPosition.WAITER);
                        restaurant.addEmployee(employee);
                        break label21;
                    case 3:
                        employee = new Employee(name, family, Gender.MALE, nationalCode, JobPosition.WORKER);
                        restaurant.addEmployee(employee);
                        break label21;
                    case 4:
                        employee = new Employee(name, family, Gender.MALE, nationalCode, JobPosition.DRIVER);
                        restaurant.addEmployee(employee);
                        break label21;
                    default:
                        System.out.println("please enter correct number : ");
                        addEmployee(restaurant);
                        break label21;
                }
            case 2:
                System.out.println("1) Chef\n2) Waiter\n3) Worker\n4) Driver ");
                choose = scanner.nextInt();
                switch(choose) {
                    case 1:
                        employee = new Employee(name, family, Gender.FEMALE, nationalCode, JobPosition.CHEF);
                        restaurant.addEmployee(employee);
                        break label21;
                    case 2:
                        employee = new Employee(name, family, Gender.FEMALE, nationalCode, JobPosition.WAITER);
                        restaurant.addEmployee(employee);
                        break label21;
                    case 3:
                        employee = new Employee(name, family, Gender.FEMALE, nationalCode, JobPosition.WORKER);
                        restaurant.addEmployee(employee);
                        break label21;
                    case 4:
                        employee = new Employee(name, family, Gender.FEMALE, nationalCode, JobPosition.DRIVER);
                        restaurant.addEmployee(employee);
                        break label21;
                    default:
                        System.out.println("please enter correct number : ");
                        addEmployee(restaurant);
                        break label21;
                }
            default:
                System.out.println("please enter correct number : ");
                addEmployee(restaurant);
        }

        employee(employee, restaurant);
    }

    public static void employee(Employee employee, Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Employee Menu***\n1) Clock in\n2) Clock out\n3) Back to main menu");
        int choose = scanner.nextInt();
        switch(choose) {
            case 1:
                System.out.println("Clock Exist : ");
                int clockIn = scanner.nextInt();
                employee.setClockIn(clockIn);
                System.out.println("The Exist's Clock Entered");
                employee(employee, restaurant);
                break;
            case 2:
                System.out.println("Clock Out : ");
                int clockOut = scanner.nextInt();
                employee.setClockOut(clockOut);
                System.out.println("The Exit's clock Entered");
                employee(employee, restaurant);
                break;
            case 3:
                mainMenu(restaurant);
                break;
            default:
                System.out.println("please enter correct number : ");
                employee(employee, restaurant);
        }

    }

    public static void addCustomer(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = null;
        System.out.println("Name : ");
        String name = scanner.next();
        System.out.println("Family : ");
        String family = scanner.next();
        System.out.println("PhoneNumber : ");
        String phoneNumber = scanner.next();
        System.out.println("1) Male \n2) Female");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                customer = new Customer(name, family, Gender.MALE, phoneNumber);
                restaurant.addCustomer(customer);
                break;
            case 2:
                customer = new Customer(name, family, Gender.FEMALE, phoneNumber);
                restaurant.addCustomer(customer);
                break;
            default:
                System.out.println("please enter correct number : ");
                addCustomer(restaurant);
        }

        customerMenu(restaurant, customer);
    }

    public static void customerMenu(Restaurant restaurant, Customer customer) {
        Scanner scanner = new Scanner(System.in);
        new LunchMenu();
        new DinnerMenu();
        System.out.println("***Customer Menu***\n1) Add new order\n2) Show orders details\n3) Cancel an order\n4) Back to main menu");
        int choose = scanner.nextInt();
        switch(choose) {
            case 1:
                System.out.println("1) Dinner \n2) Lunch");
                int choice = scanner.nextInt();
                int size;
                switch(choice) {
                    case 1:
                        System.out.println("Foods");
                        restaurant.showFoodDinner();
                        System.out.println("Drinks");
                        restaurant.showDrinkDinner();
                        System.out.println("How many you want order ?");
                        size = scanner.nextInt();
                        System.out.println("Which ones do you want to order? ");
                        String[] dinnerCode = new String[size];

                        int i;
                        for(i = 0; i < size; ++i) {
                            dinnerCode[i] = scanner.next();
                        }

                        for(i = 0; i < size; ++i) {
                            restaurant.reserveDinner(customer, dinnerCode[i]);
                        }

                        customer.showDinnerReserveNames();
                        System.out.println(" has successfully added to your order.");
                        break;
                    case 2:
                        System.out.println("Foods");
                        restaurant.showFoodLunch();
                        System.out.println("Drinks");
                        restaurant.showDrinkLunch();
                        System.out.println("How many you want order ?");
                        size = scanner.nextInt();
                        System.out.println(" Which ones do you want to order? ");
                        String[] lunch = new String[size];
                        for(i = 0; i < size; ++i) {
                            lunch[i] = scanner.next();
                        }

                        for(i = 0; i < size; ++i) {
                            restaurant.reserveLunch(customer, lunch[i]);
                        }

                        customer.showLunchReserveNames();
                        System.out.println(" has successfully added to your order.");
                }

                customerMenu(restaurant, customer);
                break;
            case 2:
                System.out.println("*** Reserved Foods ***");
                customer.showDinnerReserved();
                customer.showLunchReserved();
                customerMenu(restaurant, customer);
                break;
            case 3:
                System.out.println("*** Reserved Foods ***");
                customer.showReserve();
                String code = scanner.next();
                restaurant.remove(customer, code);
                customerMenu(restaurant, customer);
                break;
            case 4:
                mainMenu(restaurant);
                break;
            default:
                System.out.println("please enter correct number : ");
                customerMenu(restaurant, customer);
        }

    }
}