public class Fichier extends composantImplement implements ComposanFileSystem{
    String content;
    public Fichier(String n, Owner o) {
        super(n, o);
    }

public String getContent(){
    return this.content;
}


@Override
public int getSize() {
    // TODO Auto-generated method stub
    return 0;
}

@Override
public void appendContent(String content) {
    // TODO Auto-generated method stub
    
}

@Override
public void setOwner(Owner owner) {
    // TODO Auto-generated method stub
    
}

@Override
public boolean isCompsite() {
    // TODO Auto-generated method stub
    return false;
}

}
