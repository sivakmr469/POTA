package com.accenture.tag.file.uploader.utility;


public interface Constants {
	
	public static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
	public static final String REST_HEADER_CONTENT_TYPE = "application/json; charset=UTF-8";
	public static final int HTTP_STATUS_CODE_OK= 200;
	public static final String API_ERROR = "Error";
	public static final String ERROR_OCCURED = "An error occured";
	public static final String TAG_SUCCESS = "100";
	public static final String UPLOAD_FILE_PATH= "/usr/local/share/jboss/probes/";
	public static final String TEMP_UPLOAD_FILE_PATH= "/usr/local/share/jboss/bin/workorder/temp";
	public static final String EXTRACT_UPLOAD_FILE_PATH= "/usr/local/share/jboss/bin/workorder/extract";
	
	
	public static final String CREATE_WORKORDER = "/workorder/create";
	public static final String DEVICE_DELIMITER = ",";
	public static final String RETRIEVE_WORKORDER_DETAILS = "/workorder/retrieve/details";
	public static final String DOWNLOAD_RESULTS = "/workorder/download/results";
	

}
