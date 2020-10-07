import com.sap.piper.Credential
import groovy.transform.Field

@Field String STEP_NAME = getClass().getName()
@Field String METADATA_FILE = 'metadata/gctsExecuteABAPUnitTests.yaml'

void call(Map parameters = [:]) {
    List credentials = [
        [type: Credential.USERNAME_PASSWORD, id: 'abapCredentialsId', env: ['PIPER_username', 'PIPER_password']]
    ]
    piperExecuteBin(parameters, STEP_NAME, METADATA_FILE, credentials)
}
