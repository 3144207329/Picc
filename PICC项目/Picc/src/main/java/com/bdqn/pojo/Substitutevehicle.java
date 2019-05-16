package com.bdqn.pojo;

public class Substitutevehicle {
    private Integer msId;//代检车id
    private String userName;//录入人

    public Integer getUserId() {
        return userId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    private Integer page;
    private Integer rows;
    private Integer userId;//录入id
    private String company;//所属公司
    private String customerName;//客户姓名
    private String telephone;//电话号码
    private String vehicleType;//车型
    private String licensePlate;//车牌号
    private String strengthPolicy;//交强保单号
    private String testingName;//监测站名称
    private String scheduledTime;//预定时间
    private Integer submission;//是否提交
    private Integer reject;//是否驳回
    private String rejectInformation;//驳回信息
    private Integer approval;//是否审批
    private Integer handle;//是否处理
    private Integer state;//注销状态

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getMsId() {
        return msId;
    }

    public void setMsId(Integer msId) {
        this.msId = msId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getStrengthPolicy() {
        return strengthPolicy;
    }

    public void setStrengthPolicy(String strengthPolicy) {
        this.strengthPolicy = strengthPolicy;
    }

    public String getTestingName() {
        return testingName;
    }

    public void setTestingName(String testingName) {
        this.testingName = testingName;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Integer getSubmission() {
        return submission;
    }

    public void setSubmission(Integer submission) {
        this.submission = submission;
    }

    public Integer getReject() {
        return reject;
    }

    public void setReject(Integer reject) {
        this.reject = reject;
    }

    public String getRejectInformation() {
        return rejectInformation;
    }

    public void setRejectInformation(String rejectInformation) {
        this.rejectInformation = rejectInformation;
    }

    public Integer getApproval() {
        return approval;
    }

    public void setApproval(Integer approval) {
        this.approval = approval;
    }

    public Integer getHandle() {
        return handle;
    }

    public void setHandle(Integer handle) {
        this.handle = handle;
    }




}
