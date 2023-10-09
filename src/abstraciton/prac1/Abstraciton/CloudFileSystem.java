package abstraciton.prac1.Abstraciton;

import java.io.File;
import java.util.List;

public interface CloudFileSystem {

    public List<CloudFile> getFiles();
    public List<CloudFile> search(String query);
    public CloudFile getFile(String fileId);
    public void addFile(String name, File file);
}
