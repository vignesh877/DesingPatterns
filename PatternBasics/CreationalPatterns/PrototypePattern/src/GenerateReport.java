import java.lang.classfile.instruction.StackInstruction;

interface prototype extends Cloneable{
    prototype clone();
}
public class GenerateReport implements prototype {
    private String header;
    private String content;
    private String footer;

    GenerateReport(String header , String content , String footer){
        this.header = header;
        this.content = content;
        this.footer  = footer;
    }


    @Override
    public prototype clone() {
        return new GenerateReport(this.header,this.content,this.footer);
    }

    public void setHeader(String header){
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void show() {
        System.out.println(this.header  + "\n" + this.content + "\n" +this.footer);
    }
}


