package abstraciton.prac1.Abstraciton;

import java.io.InputStream;
import java.io.OutputStream;

public interface CloudFile {
    public String getId();
    public String getName();
    public int getLength();
    public boolean hasUrl();
    public String getUrl();
    public InputStream getInputStream();
    public void write(OutputStream out);
    public void delete();
}
