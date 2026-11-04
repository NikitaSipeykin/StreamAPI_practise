package hw.stream_api.second;

class SourceFile {

  private String name;
  private long sizeBytes;
  public static final long ONE_MB = 1024L * 1024;


  public SourceFile(String name, long sizeBytes) {
    this.name = name;
    this.sizeBytes = sizeBytes;
  }

  public static SourceFile ofKilobytes(String name, double sizeKB) {
    return new SourceFile(name, (long) (sizeKB * 1024));
  }

  public static SourceFile ofMegabytes(String name, double sizeMB) {
    return new SourceFile(name, (long) (sizeMB * 1024 * 1024));
  }

  public static SourceFile ofBytes(String name, long sizeBytes) {
    return new SourceFile(name, sizeBytes);
  }

  public String getName() {
    return name;
  }

  public long getSizeBytes() {
    return sizeBytes;
  }
}
