//Assignment 8: Interface Inheritance - Musical Instruments

interface Instrument{

void play();



}
interface StringInstrument extends Instrument{
void tuneStrings();
}


class Guitar implements Instrument,StringInstrument{

public void play(){

System.out.println("entred into play method");




}
public void tuneStrings(){

System.out.println("entered into tune strings method");


}
}

class Main17{
public static void main(String...k){


Instrument instr=new Guitar();
instr.play();

StringInstrument stin=new Guitar();
stin.tuneStrings();

}


}