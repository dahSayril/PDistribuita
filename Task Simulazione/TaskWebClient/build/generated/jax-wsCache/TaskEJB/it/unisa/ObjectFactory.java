
package it.unisa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.unisa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetByAssignee_QNAME = new QName("http://unisa.it/", "getByAssignee");
    private final static QName _GetTask_QNAME = new QName("http://unisa.it/", "getTask");
    private final static QName _CreateTask_QNAME = new QName("http://unisa.it/", "createTask");
    private final static QName _GetByMinHoursWorkResponse_QNAME = new QName("http://unisa.it/", "getByMinHoursWorkResponse");
    private final static QName _GetStarted_QNAME = new QName("http://unisa.it/", "getStarted");
    private final static QName _UpdateTask_QNAME = new QName("http://unisa.it/", "updateTask");
    private final static QName _GetNotAssignedResponse_QNAME = new QName("http://unisa.it/", "getNotAssignedResponse");
    private final static QName _GetStartedResponse_QNAME = new QName("http://unisa.it/", "getStartedResponse");
    private final static QName _GetByTipe_QNAME = new QName("http://unisa.it/", "getByTipe");
    private final static QName _GetByMinHoursWork_QNAME = new QName("http://unisa.it/", "getByMinHoursWork");
    private final static QName _GetNotComplete_QNAME = new QName("http://unisa.it/", "getNotComplete");
    private final static QName _GetNotCompleteResponse_QNAME = new QName("http://unisa.it/", "getNotCompleteResponse");
    private final static QName _GetByHoursWorkResponse_QNAME = new QName("http://unisa.it/", "getByHoursWorkResponse");
    private final static QName _UpdateTaskResponse_QNAME = new QName("http://unisa.it/", "updateTaskResponse");
    private final static QName _GetTaskResponse_QNAME = new QName("http://unisa.it/", "getTaskResponse");
    private final static QName _GetByAssigneeResponse_QNAME = new QName("http://unisa.it/", "getByAssigneeResponse");
    private final static QName _RemoveTask_QNAME = new QName("http://unisa.it/", "removeTask");
    private final static QName _TaskEntity_QNAME = new QName("http://unisa.it/", "taskEntity");
    private final static QName _RemoveTaskResponse_QNAME = new QName("http://unisa.it/", "removeTaskResponse");
    private final static QName _CreateTaskResponse_QNAME = new QName("http://unisa.it/", "createTaskResponse");
    private final static QName _GetByHoursWork_QNAME = new QName("http://unisa.it/", "getByHoursWork");
    private final static QName _GetNotAssigned_QNAME = new QName("http://unisa.it/", "getNotAssigned");
    private final static QName _GetAllTasksResponse_QNAME = new QName("http://unisa.it/", "getAllTasksResponse");
    private final static QName _GetByTipeResponse_QNAME = new QName("http://unisa.it/", "getByTipeResponse");
    private final static QName _GetAllTasks_QNAME = new QName("http://unisa.it/", "getAllTasks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unisa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllTasks }
     * 
     */
    public GetAllTasks createGetAllTasks() {
        return new GetAllTasks();
    }

    /**
     * Create an instance of {@link GetNotAssigned }
     * 
     */
    public GetNotAssigned createGetNotAssigned() {
        return new GetNotAssigned();
    }

    /**
     * Create an instance of {@link CreateTaskResponse }
     * 
     */
    public CreateTaskResponse createCreateTaskResponse() {
        return new CreateTaskResponse();
    }

    /**
     * Create an instance of {@link GetByHoursWork }
     * 
     */
    public GetByHoursWork createGetByHoursWork() {
        return new GetByHoursWork();
    }

    /**
     * Create an instance of {@link RemoveTaskResponse }
     * 
     */
    public RemoveTaskResponse createRemoveTaskResponse() {
        return new RemoveTaskResponse();
    }

    /**
     * Create an instance of {@link GetAllTasksResponse }
     * 
     */
    public GetAllTasksResponse createGetAllTasksResponse() {
        return new GetAllTasksResponse();
    }

    /**
     * Create an instance of {@link GetByTipeResponse }
     * 
     */
    public GetByTipeResponse createGetByTipeResponse() {
        return new GetByTipeResponse();
    }

    /**
     * Create an instance of {@link TaskEntity }
     * 
     */
    public TaskEntity createTaskEntity() {
        return new TaskEntity();
    }

    /**
     * Create an instance of {@link RemoveTask }
     * 
     */
    public RemoveTask createRemoveTask() {
        return new RemoveTask();
    }

    /**
     * Create an instance of {@link GetByAssigneeResponse }
     * 
     */
    public GetByAssigneeResponse createGetByAssigneeResponse() {
        return new GetByAssigneeResponse();
    }

    /**
     * Create an instance of {@link GetTaskResponse }
     * 
     */
    public GetTaskResponse createGetTaskResponse() {
        return new GetTaskResponse();
    }

    /**
     * Create an instance of {@link GetNotCompleteResponse }
     * 
     */
    public GetNotCompleteResponse createGetNotCompleteResponse() {
        return new GetNotCompleteResponse();
    }

    /**
     * Create an instance of {@link GetByMinHoursWork }
     * 
     */
    public GetByMinHoursWork createGetByMinHoursWork() {
        return new GetByMinHoursWork();
    }

    /**
     * Create an instance of {@link GetNotComplete }
     * 
     */
    public GetNotComplete createGetNotComplete() {
        return new GetNotComplete();
    }

    /**
     * Create an instance of {@link GetByHoursWorkResponse }
     * 
     */
    public GetByHoursWorkResponse createGetByHoursWorkResponse() {
        return new GetByHoursWorkResponse();
    }

    /**
     * Create an instance of {@link UpdateTaskResponse }
     * 
     */
    public UpdateTaskResponse createUpdateTaskResponse() {
        return new UpdateTaskResponse();
    }

    /**
     * Create an instance of {@link GetNotAssignedResponse }
     * 
     */
    public GetNotAssignedResponse createGetNotAssignedResponse() {
        return new GetNotAssignedResponse();
    }

    /**
     * Create an instance of {@link UpdateTask }
     * 
     */
    public UpdateTask createUpdateTask() {
        return new UpdateTask();
    }

    /**
     * Create an instance of {@link GetStarted }
     * 
     */
    public GetStarted createGetStarted() {
        return new GetStarted();
    }

    /**
     * Create an instance of {@link GetByTipe }
     * 
     */
    public GetByTipe createGetByTipe() {
        return new GetByTipe();
    }

    /**
     * Create an instance of {@link GetStartedResponse }
     * 
     */
    public GetStartedResponse createGetStartedResponse() {
        return new GetStartedResponse();
    }

    /**
     * Create an instance of {@link GetByAssignee }
     * 
     */
    public GetByAssignee createGetByAssignee() {
        return new GetByAssignee();
    }

    /**
     * Create an instance of {@link GetByMinHoursWorkResponse }
     * 
     */
    public GetByMinHoursWorkResponse createGetByMinHoursWorkResponse() {
        return new GetByMinHoursWorkResponse();
    }

    /**
     * Create an instance of {@link CreateTask }
     * 
     */
    public CreateTask createCreateTask() {
        return new CreateTask();
    }

    /**
     * Create an instance of {@link GetTask }
     * 
     */
    public GetTask createGetTask() {
        return new GetTask();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByAssignee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByAssignee")
    public JAXBElement<GetByAssignee> createGetByAssignee(GetByAssignee value) {
        return new JAXBElement<GetByAssignee>(_GetByAssignee_QNAME, GetByAssignee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getTask")
    public JAXBElement<GetTask> createGetTask(GetTask value) {
        return new JAXBElement<GetTask>(_GetTask_QNAME, GetTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "createTask")
    public JAXBElement<CreateTask> createCreateTask(CreateTask value) {
        return new JAXBElement<CreateTask>(_CreateTask_QNAME, CreateTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByMinHoursWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByMinHoursWorkResponse")
    public JAXBElement<GetByMinHoursWorkResponse> createGetByMinHoursWorkResponse(GetByMinHoursWorkResponse value) {
        return new JAXBElement<GetByMinHoursWorkResponse>(_GetByMinHoursWorkResponse_QNAME, GetByMinHoursWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStarted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getStarted")
    public JAXBElement<GetStarted> createGetStarted(GetStarted value) {
        return new JAXBElement<GetStarted>(_GetStarted_QNAME, GetStarted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateTask")
    public JAXBElement<UpdateTask> createUpdateTask(UpdateTask value) {
        return new JAXBElement<UpdateTask>(_UpdateTask_QNAME, UpdateTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotAssignedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getNotAssignedResponse")
    public JAXBElement<GetNotAssignedResponse> createGetNotAssignedResponse(GetNotAssignedResponse value) {
        return new JAXBElement<GetNotAssignedResponse>(_GetNotAssignedResponse_QNAME, GetNotAssignedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStartedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getStartedResponse")
    public JAXBElement<GetStartedResponse> createGetStartedResponse(GetStartedResponse value) {
        return new JAXBElement<GetStartedResponse>(_GetStartedResponse_QNAME, GetStartedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByTipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByTipe")
    public JAXBElement<GetByTipe> createGetByTipe(GetByTipe value) {
        return new JAXBElement<GetByTipe>(_GetByTipe_QNAME, GetByTipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByMinHoursWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByMinHoursWork")
    public JAXBElement<GetByMinHoursWork> createGetByMinHoursWork(GetByMinHoursWork value) {
        return new JAXBElement<GetByMinHoursWork>(_GetByMinHoursWork_QNAME, GetByMinHoursWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotComplete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getNotComplete")
    public JAXBElement<GetNotComplete> createGetNotComplete(GetNotComplete value) {
        return new JAXBElement<GetNotComplete>(_GetNotComplete_QNAME, GetNotComplete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotCompleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getNotCompleteResponse")
    public JAXBElement<GetNotCompleteResponse> createGetNotCompleteResponse(GetNotCompleteResponse value) {
        return new JAXBElement<GetNotCompleteResponse>(_GetNotCompleteResponse_QNAME, GetNotCompleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByHoursWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByHoursWorkResponse")
    public JAXBElement<GetByHoursWorkResponse> createGetByHoursWorkResponse(GetByHoursWorkResponse value) {
        return new JAXBElement<GetByHoursWorkResponse>(_GetByHoursWorkResponse_QNAME, GetByHoursWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateTaskResponse")
    public JAXBElement<UpdateTaskResponse> createUpdateTaskResponse(UpdateTaskResponse value) {
        return new JAXBElement<UpdateTaskResponse>(_UpdateTaskResponse_QNAME, UpdateTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getTaskResponse")
    public JAXBElement<GetTaskResponse> createGetTaskResponse(GetTaskResponse value) {
        return new JAXBElement<GetTaskResponse>(_GetTaskResponse_QNAME, GetTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByAssigneeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByAssigneeResponse")
    public JAXBElement<GetByAssigneeResponse> createGetByAssigneeResponse(GetByAssigneeResponse value) {
        return new JAXBElement<GetByAssigneeResponse>(_GetByAssigneeResponse_QNAME, GetByAssigneeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "removeTask")
    public JAXBElement<RemoveTask> createRemoveTask(RemoveTask value) {
        return new JAXBElement<RemoveTask>(_RemoveTask_QNAME, RemoveTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "taskEntity")
    public JAXBElement<TaskEntity> createTaskEntity(TaskEntity value) {
        return new JAXBElement<TaskEntity>(_TaskEntity_QNAME, TaskEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "removeTaskResponse")
    public JAXBElement<RemoveTaskResponse> createRemoveTaskResponse(RemoveTaskResponse value) {
        return new JAXBElement<RemoveTaskResponse>(_RemoveTaskResponse_QNAME, RemoveTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "createTaskResponse")
    public JAXBElement<CreateTaskResponse> createCreateTaskResponse(CreateTaskResponse value) {
        return new JAXBElement<CreateTaskResponse>(_CreateTaskResponse_QNAME, CreateTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByHoursWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByHoursWork")
    public JAXBElement<GetByHoursWork> createGetByHoursWork(GetByHoursWork value) {
        return new JAXBElement<GetByHoursWork>(_GetByHoursWork_QNAME, GetByHoursWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotAssigned }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getNotAssigned")
    public JAXBElement<GetNotAssigned> createGetNotAssigned(GetNotAssigned value) {
        return new JAXBElement<GetNotAssigned>(_GetNotAssigned_QNAME, GetNotAssigned.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getAllTasksResponse")
    public JAXBElement<GetAllTasksResponse> createGetAllTasksResponse(GetAllTasksResponse value) {
        return new JAXBElement<GetAllTasksResponse>(_GetAllTasksResponse_QNAME, GetAllTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByTipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getByTipeResponse")
    public JAXBElement<GetByTipeResponse> createGetByTipeResponse(GetByTipeResponse value) {
        return new JAXBElement<GetByTipeResponse>(_GetByTipeResponse_QNAME, GetByTipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getAllTasks")
    public JAXBElement<GetAllTasks> createGetAllTasks(GetAllTasks value) {
        return new JAXBElement<GetAllTasks>(_GetAllTasks_QNAME, GetAllTasks.class, null, value);
    }

}
