public abstract class composantImplement {
    private String name;
    private Owner owner;
    public composantImplement(String n, Owner o){
        this.name=n;
        this.owner=o;
    }
public Owner getOwner(){
    return this.owner;
}

public String getName(){
return this.name;
}
}
