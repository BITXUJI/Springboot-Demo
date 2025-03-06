import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.utility.DockerImageName;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;

import static org.testcontainers.containers.localstack.LocalStackContainer.Service;

import java.net.URI;

public class S3ServiceTest {

    // private static LocalStackContainer localStack;

    // @BeforeAll
    // static void setUp() {
    //     localStack = new LocalStackContainer(
    //             DockerImageName.parse("localstack/localstack:latest"))
    //                     .withServices(Service.S3) // 如果还需要 SQS、DynamoDB 等，也可以一并添加
    //                     .withEnv("DEFAULT_REGION", "jp-northeast-1"); // 设置默认Region
    //     localStack.start();
    // }

    // @Test
    // void testS3Operations() {
    //     // 获取 LocalStack 中的 S3 endpoint
    //     String s3Endpoint = localStack.getEndpointOverride(Service.S3).toString();

    //     // 这里可以使用 AWS SDK 来创建 S3Client，并将 endpoint 配置成 LocalStack 中的地址
    //     // 例如：
    //     S3Client s3Client = S3Client.builder()
    //             .endpointOverride(URI.create(s3Endpoint))
    //             .region(Region.of(localStack.getRegion()))
    //             .credentialsProvider(
    //                     StaticCredentialsProvider.create(
    //                             AwsBasicCredentials.create("test", "test")))
    //             .build();

    //     // 然后就可以操作 s3Client, 并断言结果
    //     // 例如：创建Bucket、上传文件等
    //     String bucketName = "test-bucket";
    //     s3Client.createBucket(CreateBucketRequest.builder().bucket(bucketName).build());

    //     // 验证Bucket创建成功……
    //     // ...
    // }
}
