package millet.dai.study.pattern;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class Man implements Human, Cloneable, Serializable {
    private String name;
    private String sex;
    private Body body;
    private boolean deep;

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (deep) {
            return this.deepClone();
        } else {
            return super.clone();
        }
    }

    private Object deepClone() {
        ObjectOutputStream oo = null;
        ByteArrayInputStream bi = null;
        ObjectInputStream oi = null;
        try (ByteArrayOutputStream bo = new ByteArrayOutputStream()) {
            oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            bi = new ByteArrayInputStream(bo.toByteArray());
            oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (oo != null) {
                    oo.close();
                }
                if (bi != null) {
                    bi.close();
                }
                if (oi != null) {
                    oi.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", body=" + body +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public boolean isDeep() {
        return deep;
    }

    public void setDeep(boolean deep) {
        this.deep = deep;
    }
}
