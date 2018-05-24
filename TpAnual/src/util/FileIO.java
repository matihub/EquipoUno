package util;

import java.io.*;

public class FileIO {
    private  String root;
    public FileIO() {
    }

    public FileIO(String root) {
        this.root = root;
    }

    public boolean write(Object object) {
        File file = null;

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            file = new File(root);

            if (!file.exists()) {
                file.createNewFile();
            }

            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(object);
        } catch (Exception e) {
            return false;
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }

    public Object read() {
        File file = null;

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        Object object = null;

        try {
            file = new File(root);

            if (!file.exists()) {
                file.createNewFile();
            }

            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            object = objectInputStream.readObject();
        } catch (Exception e) {
            return object;
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return object;
    }
}
