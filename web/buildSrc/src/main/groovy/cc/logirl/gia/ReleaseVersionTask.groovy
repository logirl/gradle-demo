package cc.logirl.gia
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction


class ReleaseVersionTask extends DefaultTask {
    // 没有使用DefaultTask的属性来声明它的输入和输出，而是使用org.gradle.api.tasks包下的注解
    @Input Boolean release
    @OutputFile File destFile
    ReleaseVersionTask() { // 在构造器中设置task的group和description属性
        group = 'aa'
        description = 'bb'
    }
    @TaskAction   // 使用注解声明将被执行的方法
    void start() {
        project.version.release = true
        ant.propertyfile(file: destFile) {
            entry(key: 'release', type: 'string', operation: '=', value: 'true')
        }
    }
}