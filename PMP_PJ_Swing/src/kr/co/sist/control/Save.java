package kr.co.sist.control;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

import kr.co.sist.model.Pmp;

public class Save {
	private Vector<Pmp> vector;
	private JTextArea textArea;
	
	public Save(Vector<Pmp> vector) {
		this.vector = vector;
	}
	

	public void save() {
	    JFileChooser fileChooser = new JFileChooser();
	    int retval = fileChooser.showSaveDialog(fileChooser);
	    if (retval == JFileChooser.APPROVE_OPTION) {
	      File file = fileChooser.getSelectedFile();
	      if (file == null) {
	        return;
	      }
	      if (!file.getName().toLowerCase().endsWith(".txt")) {
	        file = new File(file.getParentFile(), file.getName() + ".txt");
	      }
	      try {
	        textArea.write(new OutputStreamWriter(new FileOutputStream(file),
	            "utf-8"));
	        Desktop.getDesktop().open(file);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	  }
	protected void saveToFile() {}

}
