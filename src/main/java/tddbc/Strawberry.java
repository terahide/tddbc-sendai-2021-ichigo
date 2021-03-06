package tddbc;

public class Strawberry {
    Kind kind;
    Size size;
    public Strawberry(Kind kind,Size size){
        super();
        this.kind = kind;
        this.size = size;
    }
    public Strawberry(Kind kind,int weight){
        super();
        this.kind = kind;
        this.size = Size.toSize(weight);
    }
    public Kind getKind(){
        return kind;
    }
    public Size getSize(){
        return size;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", kind.name(), size.name());
    }

    public boolean isSameKind(Strawberry strawberry) {
        return this.getKind() == strawberry.getKind();
    }

    public int getDiffelence(Strawberry strawberry) {
        return this.getSize().getDiffelence(strawberry.getSize());
    }
}
