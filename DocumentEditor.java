abstract class Document {
    protected boolean isOpen = false;
    protected boolean isModified = false;
    protected String docName;

    public void open() {
        if (isOpen) {
            System.out.println("Already open");
        } else {
            isOpen = true;
            System.out.println("Opening " + docName);
        }
    }

    public void close() {
        if (!isOpen) {
            System.out.println("Document is not open");
            return;
        }

        if (isModified) {
            System.out.println("Unsaved changes, saving...");
            save();
        }

        isOpen = false;
        System.out.println("Closing " + docName);
    }

    public abstract void save();
}
class TextDocument extends Document {
    private String content = "";
    public TextDocument() {
        this.docName = "Text Document";
    }

    public void save() {
        System.out.println("Saving text content...: "+content);
        isModified = false;
    }
    public void edit(String data) {
        if (!isOpen) {
            System.out.println("Open document before editing");
            return;
        }
        content += data;
        isModified = true;
        System.out.println("Text updated");
    }
}
class ImageDocument extends Document {

    public ImageDocument() {
        this.docName = "Image Document";
    }

    public void save() {
        System.out.println("Compressing and saving image...");
        isModified = false;
    }
    
     
}
class SpreadsheetDocument extends Document {

    public SpreadsheetDocument() {
        this.docName = "Spreadsheet Document";
    }

    public void save() {
        System.out.println("Calculating formulas and saving...");
        isModified = false;
    }
}
public class DocumentEditor {
    public static void main(String[] main){
        TextDocument doc = new TextDocument(); 
        doc.open();
        doc.edit("Hello ");   
        doc.edit("World");
        doc.close();
    }

}
