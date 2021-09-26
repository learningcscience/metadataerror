

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.mycompany.myapp.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.mycompany.myapp.UserRole'
grails.plugin.springsecurity.authority.className = 'com.mycompany.myapp.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

grails.plugin.springsecurity.providerNames = ['samlAuthenticationProvider', 'daoAuthenticationProvider', 'anonymousAuthenticationProvider']

grails.plugin.springsecurity.saml.active = true
grails.plugin.springsecurity.saml.afterLoginUrl = '/'
grails.plugin.springsecurity.saml.afterLogoutUrl = '/'
grails.plugin.springsecurity.saml.responseSkew = 300
grails.plugin.springsecurity.saml.signatureAlgorithm = 'rsa-sha256'
grails.plugin.springsecurity.saml.digestAlgorithm = 'sha256'
grails.plugin.springsecurity.saml.userGroupAttribute = 'roles'
grails.plugin.springsecurity.saml.autoCreate.active = false  //If you want the plugin to generate users in the DB as they are authenticated via SAML
grails.plugin.springsecurity.saml.autoCreate.key = 'id'
grails.plugin.springsecurity.saml.autoCreate.assignAuthorities=false  //If you want the plugin to assign the authorities that come from the SAML message.
grails.plugin.springsecurity.saml.metadata.defaultIdp = 'byuidp'
grails.plugin.springsecurity.saml.metadata.url = '/saml/metadata'
grails.plugin.springsecurity.saml.metadata.providers = [byuidp:'security/idp-local.xml']


grails.plugin.springsecurity.saml.metadata.sp.file = "security/sp.xml"

grails.plugin.springsecurity.saml.metadata.sp.defaults.local = true;
grails.plugin.springsecurity.saml.metadata.sp.defaults.entityId = 'test'
grails.plugin.springsecurity.saml.metadata.sp.defaults.alias = 'test';
grails.plugin.springsecurity.saml.metadata.sp.defaults.securityProfile = 'pkix';
grails.plugin.springsecurity.saml.metadata.sp.defaults.signingKey = 'apollo';
grails.plugin.springsecurity.saml.metadata.sp.defaults.encryptionKey = 'apollo';
grails.plugin.springsecurity.saml.metadata.sp.defaults.tlsKey = 'apollo';
grails.plugin.springsecurity.saml.metadata.sp.defaults.requireArtifactResolveSigned = false;
grails.plugin.springsecurity.saml.metadata.sp.defaults.requireLogoutRequestSigned = false;
grails.plugin.springsecurity.saml.metadata.sp.defaults.requireLogoutResponseSigned = false;
grails.plugin.springsecurity.saml.keyManager.storeFile = "classpath:security/samlKeystore.jks"
grails.plugin.springsecurity.saml.keyManager.storePass = 'pepsicola'
grails.plugin.springsecurity.saml.keyManager.passwords = [apollo:'pepsicola']
grails.plugin.springsecurity.saml.keyManager.defaultKey = 'apollo'



