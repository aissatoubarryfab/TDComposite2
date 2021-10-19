import java.util.*;

public class Repertoire extends composantImplement implements ComposanFileSystem,Composite{
 private List<Fichier> children;
  public  Repertoire(String name,Owner o){
    super(name,o);
  }
 

}

@Override
public List<Fichier> getChilrend() {
    // TODO Auto-generated method stub
    return null;
}
@Override
public void addChild(Object t) {
    // TODO Auto-generated method stub
    
}
@Override
public boolean removeChild(Object t) {
    // TODO Auto-generated method stub
    return false;
}
@Override
public boolean isCompsite() {
    // TODO Auto-generated method stub
    return false;
}