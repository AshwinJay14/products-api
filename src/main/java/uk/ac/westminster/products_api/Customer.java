package uk.ac.westminster.products_api;

public class Customer {
    private Long id;
    private String name;
    private Address address;
    private String email;

    public Customer(Long id, String name, Address address, String email){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }





}
