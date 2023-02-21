data "aws_iam_policy_document" "ecr" {
    statement {
        effect = "Allow"
        actions = ["sts:AssumeRoleWithWebIdentity"]

        principals {
            type = "Federated"
            identifiers = [aws_iam_openid_connect_provider.github.arn]
        }

        condition {
            test = "StringEquals"
            variable = "token.actions.githubusercontent.com:aud"
            values = ["sts.amazonaws.com"]
        }

        condition {
             test = "StringLike"
             variable = "token.actions.githubusercontent.com:sub"
             values = ["repo:joseangel190/ecr-oidc:*"]
        }
    }
}

resource "aws_iam_role" "ecr" {
    name = "ecr-jose"
    assume_role_policy = data.aws_iam_policy_document.ecr.json
}
