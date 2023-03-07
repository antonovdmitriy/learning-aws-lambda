# Description

Bunch of lambdas to test  without any framework like Spring or Quarkus

# To build project

```shell
mvn clean package
```

# To deploy

## Via SAM
- How to install AWS CLI [see](https://github.com/antonovdmitriy/it-notes/blob/master/aws/AWS.md#aws-sam-cli)
- How to install SAM  [see](https://github.com/antonovdmitriy/it-notes/blob/master/aws/AWS.md#aws-sam-cli)
- create s3 bucket to deploy code 

```shell
aws s3 mb s3://some_unique_name
```

```shell
 sam deploy \
--s3-bucket s3_name \
--stack-name stack-name \
--capabilities CAPABILITY_IAM
```

# To invoke

## Via AWS CLI

[See this](https://github.com/antonovdmitriy/it-notes/blob/master/aws/AWS.md#invoke-lambda-via-aws-cli)

# To clear

```bash
aws cloudformation delete-stack --stack-name stack-name
```
