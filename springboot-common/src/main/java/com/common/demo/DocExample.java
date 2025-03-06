package com.common.demo;

/**
 * <p>演示类，用于展示多样的 Javadoc 写法。</p>
 *
 * <p>该类包含：</p>
 * <ul>
 * <li>构造方法示例</li>
 * <li>常量字段和普通字段示例</li>
 * <li>方法示例（带有重载、可变参数、泛型）</li>
 * <li>内部接口 {@link DocExample.TaskRunner}</li>
 * <li>内部枚举 {@link DocExample.Status}</li>
 * </ul>
 *
 * <p>使用示例：</p>
 * 
 * <pre>{@code
 * DocExample example = new DocExample("示例任务");
 * example.runTask(10);
 * }</pre>
 *
 * @author
 *         张三 (Zhang San)
 * @version 2.0
 * @since 1.0
 */
public class DocExample {

    /**
     * 任务名称。该字段为普通的实例变量。
     * <p>可以通过 {@link #getTaskName()} 方法获取。</p>
     */
    private String taskName;

    /**
     * 用于计数的公共常量。通常在常量名前使用大写加下划线约定。
     */
    public static final int MAX_COUNT = 100;

    // =====================
    //      构造方法
    // =====================

    /**
     * <p>默认构造方法。初始化空任务名称。</p>
     *
     * @see #DocExample(String)
     */
    public DocExample() {
        this.taskName = "默认任务";
    }

    /**
     * <p>带参数的构造方法。</p>
     *
     * @param taskName 任务名称
     * @throws IllegalArgumentException 当 taskName 为空时抛出异常
     */
    public DocExample(String taskName) {
        if (taskName == null || taskName.isEmpty()) {
            throw new IllegalArgumentException("任务名称不能为空");
        }
        this.taskName = taskName;
    }

    // =====================
    //       方法示例
    // =====================

    /**
     * 获取任务名称。
     *
     * @return 任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 设置任务名称。
     *
     * @param taskName 任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * <p>执行任务的方法示例。</p>
     * <p>该方法没有返回值，但可能抛出异常。</p>
     *
     * @param times 执行次数
     * @throws RuntimeException 当执行出现异常时抛出
     * @see #runTask()
     */
    public void runTask(int times) {
        for (int i = 0; i < times; i++) {
            // 简单演示：输出任务名称
            System.out.println("Running task: " + taskName + " [" + (i + 1) + "/" + times + "]");
        }
    }

    /**
     * <p>无参数的执行任务方法。</p>
     * <p>可见它和 {@link #runTask(int)} 形成重载。</p>
     *
     * @see #runTask(int)
     */
    public void runTask() {
        runTask(1);
    }

    /**
     * <p>可变参数方法示例。</p>
     * <p>演示如何使用可变参数，并进行 Javadoc 注释。</p>
     *
     * @param messages 可变参数，表示多条消息
     * @return 拼接后的消息字符串
     */
    public String concatenateMessages(String... messages) {
        StringBuilder sb = new StringBuilder();
        for (String msg : messages) {
            sb.append(msg).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * <p>带泛型的静态方法示例。</p>
     * <p>接受一个泛型列表并返回其中的首个元素。</p>
     *
     * @param <T> 列表中元素的类型
     * @param list 泛型列表
     * @return 列表的第一个元素，如果为空则返回 {@code null}
     */
    public static <T> T getFirstElement(java.util.List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /**
     * <p>演示使用内部接口的场景。</p>
     *
     * @param runner 实现 {@link TaskRunner} 的对象
     * @since 2.0
     */
    public void executeWithRunner(TaskRunner runner) {
        runner.run();
    }

    // =====================
    //      内部接口
    // =====================

    /**
     * <p>任务执行器接口。</p>
     * <p>用于演示如何在 Javadoc 中注释内部接口。</p>
     */
    public interface TaskRunner {
        /**
         * 执行任务。
         */
        void run();
    }

    // =====================
    //      内部枚举
    // =====================

    /**
     * <p>示例内部枚举，表示任务状态。</p>
     */
    public enum Status {
        /**
         * 表示任务尚未开始。
         */
        NOT_STARTED,

        /**
         * 表示任务正在运行。
         */
        RUNNING,

        /**
         * 表示任务已完成。
         */
        COMPLETED
    }

    // =====================
    //     内部注解示例
    // =====================

    /**
     * <p>示例内部注解。可标注在方法上，用于说明某种特性。</p>
     */
    public @interface BetaFeature {
        /**
         * <p>功能描述信息。</p>
         */
        String value() default "此功能处于 Beta 阶段";
    }

    /**
     * 使用内部注解的示例方法。
     */
    @BetaFeature("Demo 方法，暂不可在生产环境使用")
    public void betaMethod() {
        System.out.println("Beta feature is running...");
    }

    // =====================
    //       重写示例
    // =====================

    /**
     * <p>重写 {@code toString()} 方法并进行 Javadoc 注释示例。</p>
     *
     * @return 返回对象的字符串表现形式
     */
    @Override
    public String toString() {
        return "DocExample{" +
                "taskName='" + taskName + '\'' +
                '}';
    }
}
