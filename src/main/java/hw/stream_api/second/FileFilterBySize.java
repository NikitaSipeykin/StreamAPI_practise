package hw.stream_api.second;

// Ограничения:
// - Необходимо отфильтровать список файлов по размеру.
// - Оставить только те файлы, у которых размер больше 1 MB.
// - 1 MB = 1024 * 1024 bytes.
// - Использовать класс SourceFile как модель.
//
// Примеры:
//
// input:
// [file1.txt(500KB), file2.mp4(2MB), file3.jpg(1.5MB)]
// output:
// [file2.mp4, file3.jpg]
//
// input:
// [a.txt(100KB), b.txt(200KB)]
// output:
// []
//
// input:
// [video.mp4(5MB), image.png(1MB)]
// output:
// [video.mp4]

import java.util.List;

public class FileFilterBySize {
  public static void main(String[] args) {
    List<SourceFile> files = List.of(
        SourceFile.ofKilobytes("file1.txt", 500),
        SourceFile.ofMegabytes("file2.mp4", 2),
        SourceFile.ofMegabytes("file3.jpg", 1.5),
        SourceFile.ofKilobytes("a.txt", 100),
        SourceFile.ofKilobytes("b.txt", 200),
        SourceFile.ofMegabytes("video.mp4", 5),
        SourceFile.ofMegabytes("image.png", 1)
    );

    List<SourceFile> filteredFiles = filter(files);

    filteredFiles.forEach(file ->
        System.out.println(
            file.getName() + " — " + file.getSizeBytes() + " bytes"
        )
    );
  }


  public static List<SourceFile> filter(List<SourceFile> files) {
    return files.stream()
        .filter(file -> file.getSizeBytes() > SourceFile.ONE_MB)
        .toList();
  }
}
