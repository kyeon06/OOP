package abstraciton.prac1.Abstraciton;

import abstraciton.prac1.NoAbstraciton.CloudId;
import abstraciton.prac1.NoAbstraciton.FileInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 추상화 한다면 아래와 같이 변경할 수 있다.
 * 그 결과 클라우드가 추가가 되더라도 코드 수정하지 않아도 된다.
 *
 * OCP(개방폐쇄 원칙) : 수정에는 닫혀있고 확장에는 열려있음
 * OCP를 따르는 코드를 작성할 수 있음
 */

public class CloudFileManager {

    public List<CloudFile> getFileInfos(CloudId cloudId) {
        CloudFileSystem fileSystem = CloudFileSystemFactory.getFileSystem(cloudId);
        return fileSystem.getFiles();
    }

    public void download(CloudFile file, File localTarget) throws FileNotFoundException {
        file.write(new FileOutputStream(localTarget));
    }

    public void copy(CloudFile file, CloudId target) {
        CloudFileSystem fileSystem = CloudFileSystemFactory.getFileSystem(target);
        fileSystem.copyFrom(file);
    }
}
