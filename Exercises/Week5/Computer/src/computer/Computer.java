/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author Velyana
 */
public class Computer {

    private String type;
    private int procSpeed;
    private String[] files;

    public Computer() {
        this("", 0, new String[0]);
    }

    public Computer(String type, int procSpeed, String[] files) {
        setType(type);
        setProcSpeed(procSpeed);
        setFiles(files);
    }

    public Computer(Computer c) {
        this(c.type, c.procSpeed, c.files);
    }

    public String getType() {
        return type;
    }

    public int getProcSpeed() {
        return procSpeed;
    }

    public String[] getFiles() {
        String[] result = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            result[i] = files[i];
        }
        return result;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProcSpeed(int procSpeed) {
        this.procSpeed = procSpeed;
    }

    public void setFiles(String[] f) {
        if (f == null) {
            files = new String[0];
        } else {
            files = new String[f.length];
            for (int i = 0; i < f.length; i++) {
                files[i] = f[i];
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        if (files.length == 0) {
            result += String.format("type: %s\nprocSpeed: %d\nfiles: \n", type, procSpeed);
        } else {
            for (String s : files) {
                result += String.format("type: %s\nprocSpeed: %d\nfiles: %s\n", type, procSpeed, s);
            }
        }
        return result;
    }

}
