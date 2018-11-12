package week008;
class Numeral extends Expression
{
private int value;

public Numeral(int value){
this.value = value;
}

public Numeral(){
this.value = 0;
}

@Override
public String toString() {
return value+"";
}

@Override
public int evaluate() {
return value;
}
}